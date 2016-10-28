#!/usr/bin/env python3

# Takes a directory of call logs and separates all words, storing in a big 
# dictionary. Each word count in the dictionary is averaged with the number of
# logs and words with less than 1 average count are deleted.
# Dictionary is then output to a CSV file with the average number of hits.

import os, sys, getopt
import re
import operator	# Supports sorting operation
import glob		# Check file names

def main(argv):
	# Defaults
	direc = "."
	output = "log_words.csv"
	want_sorted = ""
	cwd = os.getcwd()

	# Parse arguments
	if len(sys.argv) != 0:
		try:
			opts, args = getopt.getopt(argv, "hd:kv", ["dir="])
		except getopt.GetoptError:
			print("Usage: parse_call_log.py -d <directory_with_log_files>")
			print("Optional options: -k (sort by key), -v (sort by value)")
			sys.exit(2)

		for opt, arg in opts:
			if opt == '-h':
				print("Usage: parse_call_log.py -d <directory_with_log_files>")
				print("Optional options: -k (sort by key), -v (sort by value)")
				sys.exit()
			elif opt in ('-d', '--dir='):
				direc = arg
			elif opt in ('-k'):
				want_sorted = "key"
			elif opt in ('-v'):
				want_sorted = "value"

	# Word dictionary that pairs each word, with the number of times it appears
	word_dict = {}
	num_logs = 0

	# Go through every log and add it to the dictionary, throwing away non-words
	os.chdir("./{0}".format(direc))
	for log in glob.glob("*log*.txt"):
		# DEBUG
		print("Adding \"{0}\"".format(os.path.basename(log)))
		with open(log, 'r') as infile:
			num_logs += 1
			for line in infile:
				words = get_words_from_line(line)
				
				# Put each word into dictionary, keeping track of count
				for word in words:
					if word in word_dict:
						word_dict[word] += 1
					else:
						word_dict[word] = 1

	# Find average number of occurrences of each word in dictionary
	words_to_delete = []
	for word in word_dict:
		avg_count = int(word_dict[word]/num_logs)
		# Mark for deletion any words with less than 1 average occurrence
		if avg_count < 1:
			words_to_delete.append(word)
		else:
			word_dict[word] = avg_count

	# Delete words with less than 1 average occurence
	for word in words_to_delete:
		del word_dict[word]

	# Change back to current working director
	os.chdir(cwd)

	# Write dictionary to a CSV file
	with open(output, 'w') as outfile:
		if want_sorted == "key":
			# Put dictionary into a sorted list of tuples (sorted by dict keys)
			sorted_words = sorted(word_dict.items(), key=operator.itemgetter(0))
			for word in sorted_words:
				outfile.write("{0},{1}\n".format(word[0], word[1]))
		elif want_sorted == "value":
			# Put dictionary into a sorted list of tuples (sorted by dict values)
			sorted_words = sorted(word_dict.items(), key=operator.itemgetter(1))
			sorted_words.reverse()
			for word in sorted_words:
				outfile.write("{0},{1}\n".format(word[0], word[1]))
		else:
			for word in word_dict:
				outfile.write("{0},{1}\n".format(word, word_dict[word]))


# Returns a list of words from the given line
def get_words_from_line(string):
	# Match words without spaces, unless quotes are used
	pattern = re.compile("(?:[\"\'][\w&._ -]*[A-Za-z][\w&._ -]*[\"\'])|(?:[\w&._-]*[A-Za-z][\w&._-]*)")
	match = re.findall(pattern, string)
	return match


# Strip off script name in arg list
if __name__ == "__main__":
	main(sys.argv[1:])
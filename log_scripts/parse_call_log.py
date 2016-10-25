#!/usr/bin/env python3

# Takes a call log and separates all words, storing in a big dictionary
# Dictionary is output to a CSV file with number of hits

import sys, getopt
import re
import operator

pattern = re.compile("(?:[\"\'][\w&._ -]*[A-Za-z][\w&._ -]*[\"\'])|(?:[\w&._-]*[A-Za-z][\w&._-]*)")

def main(argv):
	# Defaults
	log = "log.txt"
	output = "log_words.csv"
	want_sorted = ""

	# Parse arguments
	if len(sys.argv) != 0:
		try:
			opts, args = getopt.getopt(argv, "hl:kv", ["log="])
		except getopt.GetoptError:
			print("Usage: parse_call_log.py -l <log_file>")
			print("Optional options: -k (sort by key), -v (sort by value)")
			sys.exit(2)

		for opt, arg in opts:
			if opt == '-h':
				print("Usage: parse_call_log.py -l <log_file>")
				print("Optional options: -k (sort by key), -v (sort by value)")
				sys.exit()
			elif opt in ('-l', '--log='):
				log = arg
			elif opt in ('-k'):
				want_sorted = "key"
			elif opt in ('-v'):
				want_sorted = "value"

	# Word dictionary that pairs each word, with the number of times it appears
	word_dict = {}

	# Read log into counting dictionary, throwing away non-words
	with open(log, 'r') as infile:
		for line in infile:
			words = get_words_from_line(line)
			
			# Put each word into dictionary, keeping track of count
			for word in words:
				if word in word_dict:
					word_dict[word] += 1
				else:
					word_dict[word] = 1

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
	# pattern = re.compile("([\"\'][\w&._ -]*[A-Za-z][\w&._ -]*[\"\'])|([\w&._-]*[A-Za-z][\w&._-]*)")
	match = re.findall(pattern, string)
	return match


# Strip off script name in arg list
if __name__ == "__main__":
	main(sys.argv[1:])
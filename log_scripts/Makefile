# Makefile for creating, cleaning, or copying logs
# Place in /data/ficalling directory

# Grab args for make log name
ifeq (log,$(firstword $(MAKECMDGOALS)))
  RUN_ARGS := $(wordlist 2,$(words $(MAKECMDGOALS)),$(MAKECMDGOALS))
  $(eval $(RUN_ARGS):;@:)
endif

log: ./ficall.sh
	./ficall.sh $(RUN_ARGS)

copy:
	cp *.txt *.pcap /sdcard/ficalling/ 2>/dev/null || :

clean:
	rm -f fi*log*.txt fi*.pcap

sdclean:
	rm -f /sdcard/ficalling/fi*log*.txt /sdcard/ficalling/fi*.pcap

realclean: clean sdclean

.PHONY: log copy clean sdclean realclean

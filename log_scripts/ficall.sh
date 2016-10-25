#!/system/bin/sh

# A wrapper script for quick logging of
# Project Fi calling logs
# Author: Zengwen Yuan
# Date  : 2016-10-10
# Usage : ./ficall.sh <test-scenario>

ts="`date +%m%d%H%M`"
scenario="$1"
trap "trap - SIGTERM && kill -- -$$" SIGINT SIGTERM EXIT

logcat -c
tcpdump -i any -w fi${ts}-${scenario}.pcap &> /dev/null &
logcat > fi${ts}-${scenario}-log-all.txt &
logcat | grep -i tele > fi${ts}-${scenario}-log-tele.txt

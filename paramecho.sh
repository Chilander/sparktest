#!/bin/bash
echo "printing out params $#"
echo $@
COUNT=0
for i; do
	echo $i, $COUNT
	COUNT=$((COUNT+1));
done
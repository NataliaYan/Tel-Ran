#!/bin/bash
 for run in {1..10}
 do
 date +%T
 ps aux | wc -l
 sleep .5
 done
lscpu > file.txt
cat /etc/os-release | head -1 >> file.txt
cat /etc/os-release | head -1 | sed 's/NAME="//' | cut -d' ' -f1 >> file.txt
for run in {50..100}
do
touch "${run}.txt"
done 

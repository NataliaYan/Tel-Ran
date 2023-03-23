#!/bin/bash
echo -n "Enter your name, please : "
read USER
echo "hello $USER!"
echo "today : $(date)"
echo "we are working in the direktory : $(pwd)"
echo "$(ps aux | wc -l) running processes now"


#!/bin/bash

# Ensure the script exits on any error
set -e

cd ./bin

# Run ServerTCP
echo "Running ServerTCP"
java ServerTCP &

# Run ClientTCP
echo "Running ClientTCP"
java ClientTCP

#!/usr/bin/python
import sys

print 'Number of arguments:', len(sys.argv), 'arguments.'
print 'Argument List:', str(sys.argv)

print os.environ['SOME_ENV_VARS']
print os.environ['SOME_OTHER_ENV_VARS']
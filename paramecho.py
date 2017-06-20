#!/usr/bin/python
import os
import sys

print 'Number of arguments:', len(sys.argv), 'arguments.'
print 'Argument List:', str(sys.argv)

print 'SOME_ENV_VARS=', os.environ['SOME_ENV_VARS']
print 'SOME_OTHER_ENV_VARS=', os.environ['SOME_OTHER_ENV_VARS']
print 'BUILD_NUMBER=', os.environ['BUILD_NUMBER']
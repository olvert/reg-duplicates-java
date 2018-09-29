# ABOUT
???
# MISC

http://java-performance.info/hashmap-overview-jdk-fastutil-goldman-sachs-hppc-koloboke-trove-january-2015/
# MEASURES

## VERSION 0.2

Using BufferReader for input and Trove-library for faster Collections.
Also, the HashSets initial capacity is set to a suitable size and the strings
are converted to a long representation.

Measures:

| File          | Time          |
|:-------------:|:-------------:|
| Rgn00.txt     | ~ 190ms       |
| Rgn01.txt     | ~ 1500ms      |
| Rgn02.txt     | ~ 1580ms      |

## VERSION 0.1

Using BufferReader for input and simple unconfigured HashSet storage and 
duplicate check.

Measures:

| File          | Time          |
|:-------------:|:-------------:|
| Rgn00.txt     | ~ 230ms       |
| Rgn01.txt     | ~ 6000ms      |
| Rgn02.txt     | ~ 6000ms      |
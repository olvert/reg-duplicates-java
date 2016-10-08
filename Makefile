FILEPATH0 = /Users/ollesvensson/DevFiles/reg-duplicates/CXC/Rgn00.txt
FILEPATH1 = /Users/ollesvensson/DevFiles/reg-duplicates/CXC/Rgn01.txt
FILEPATH2 = /Users/ollesvensson/DevFiles/reg-duplicates/CXC/Rgn02.txt

all:
	make build
	make run0

build:
	gradle assemble
	gradle build
	
run0:
	java -jar build/libs/reg-duplicates.jar $(FILEPATH0)

run1:
	java -jar build/libs/reg-duplicates.jar $(FILEPATH1)

run2:
	java -jar build/libs/reg-duplicates.jar $(FILEPATH2)



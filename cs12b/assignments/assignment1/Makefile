#----------------------------------------------------------------
# Kevin Flores (kerflore)
# ID#: 1340020
# Due: 01/15/2018
# Makefile for Programming Assignment 1
# Makefile with macros and a submit function
#----------------------------------------------------------------
JAVASRC = Recursion.java
SOURCES = README Makefile $(JAVASRC)
MAINCLASS = Recursion
CLASSES = Recursion.class
JARFILE = Recursion

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-Class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)
clean:
	rm $(CLASSES) $(JARFILE)

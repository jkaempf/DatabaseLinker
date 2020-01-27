JAVAC		= 'C:\Program Files\Java\jdk-12.0.2\bin\javac'
JAVA		= 'C:\Program Files\Java\jdk-12.0.2\bin\java'
CLASSPATH	= './postgresql-9.4.1212.jar;./postgis.jar;.'

ifeq ($(MAINCLASS),)
MAINCLASS   = CitySimDatabaseLinkerXML
endif
EXEC		= $(MAINCLASS).class
MAINSRC		= $(MAINCLASS).java

all: $(EXEC)

$(EXEC): $(MAINSRC)
	$(JAVAC) -Xlint -classpath $(CLASSPATH) $<

run: $(EXEC)
	$(JAVA) -classpath $(CLASSPATH) $(MAINCLASS) $(ZONE) $(SCENARIO)

JAVAC		= 'C:\Program Files\Java\jdk1.8.0_152\bin\javac'
JAVA		= 'C:\Program Files\Java\jdk1.8.0_152\bin\java'
CLASSPATH	= './postgresql-9.4.1212.jar;./postgis.jar;.'

MAINCLASS   = CitySimDatabaseLinkerXML
EXEC		= $(MAINCLASS).class
MAINSRC		= $(MAINCLASS).java

all: $(EXEC)

$(EXEC): $(MAINSRC)
	$(JAVAC) -Xlint -classpath $(CLASSPATH) $<

run: $(EXEC)
	$(JAVA) -classpath $(CLASSPATH) $(MAINCLASS) $(ZONE) $(SCENARIO)

# ConcurrencyFun
Some sample runs:

java -cp . PlayRun

insideThread-1   Thread-0

final Thread-2

insideThread-2   Thread-2

insideThread-1   Thread-1

===

java -cp . PlayRun

final Thread-1

insideThread-1   Thread-1

insideThread-2   Thread-2

insideThread-1   Thread-0


=== 

java -cp . PlayRun

insideThread-0   Thread-0

final Thread-0

insideThread-2   Thread-2

insideThread-1   Thread-1

===

java -cp . PlayRun

final Thread-1

insideThread-1   Thread-0

insideThread-1   Thread-1

insideThread-2   Thread-2

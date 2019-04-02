<img src='https://g.gravizo.com/svg?
Title "Iterator UML图"

interface Aggregate
interface Iterator
class ConcerteAggregate
class ConcertrIterator

Aggregate  <--  Iterator  :Creates > 

Iterator <|.. ConcertrIterator
Aggregate <|. ConcerteAggregate
ConcerteAggregate  o--|>  ConcertrIterator

interface Iterator{
   + {abstract} hasNext():boolean
   + {abstract} next():Object
}

interface Aggregate{
   + {abstract} iterator():Iterator
}

class ConcerteAggregate{
   + iterator():Iterator
}
class ConcertrIterator{
   - concerteAggregate :ConcerteAggregate
   + hasNext():boolean
   + next():Object
}
'/>

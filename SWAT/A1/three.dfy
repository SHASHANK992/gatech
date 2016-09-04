class Lock {
var state:bool;
constructor init() modifies this;
ensures state == false; {
state := false;
}
method acquireLock() modifies this; requires state == false; ensures state == true; {
state := !state;
}
method releaseLock() modifies this; requires state == true; ensures state == false; {
state := !state;
}
}
method Main() {
var a:int := 0;
var b:int := -1;
var c:int := 0;
var l:Lock := new Lock.init(); var i:int := 100;
while (a!=b)
// Now I need to show the connection between a, b, c, and l
invariant c < i ==> l.state == false
invariant a == b ==> l.state == true
invariant c == i ==> a == b
invariant 0 <= c <= i
decreases i - c; {
  b := a;
  c := c+1;
  l.acquireLock();
  if(c < i) {
    a := a+1; l.releaseLock();
  }
} 
l.releaseLock(); 
print "Eureka";
}
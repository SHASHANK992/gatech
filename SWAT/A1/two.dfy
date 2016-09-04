method Main() {
var a:int := 0;
var b:int := -1;
var c:int := 0;
var i:int := 100;
while (a!=b) 
// Dafny can't tell here that at the exit of the loop how c and i are related
// I need to add some invariants to let Dafny know and a and b relate to c and i
invariant c == i ==> a == b
invariant 0 <= c <= i
decreases i - c; 
{
  b := a;
  c := c+1;
  if (c < i) {
  a := a+1;
  }
} 
print "Eureka";
}
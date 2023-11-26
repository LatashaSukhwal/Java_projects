class XCopy {
public static void main(String [] args) {
int orig = 42;
XCopy x = new XCopy();
int y = x.go(orig);
System.out.println(orig + " " + y);
}
int go(int arg) {
arg = arg * 2;
return arg;
}
}

class Outputs {
public static void main(String [] args) {
Outputs o = new Outputs();
o.go();
}
void go() {
int y = 7;
for(int x = 1; x < 8; x++) {
y++;
if (x > 4) {
System.out.print(++y + " ");
}
if (y > 14) {
System.out.println(" x = " + x);
break;
}
}
}
}
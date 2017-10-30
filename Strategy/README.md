# Strategy Pattern

Strategy lets the algorithm vary independently from clients that use it.

![Strategy Pattern](uml.gif?raw=true "Strategy Pattern")

```
@Test
public void simpleQuack() {
	subject = new Duck(new NoFly(), new SimpleQuack(), new SimpleDisplay());
	subject.quack();
	
	Assert.assertEquals("Quack!", outContent.toString());
}

@Test
public void noFly() {
	subject = new Duck(new NoFly(), new SimpleQuack(), new SimpleDisplay());
	
	subject.fly();
	Assert.assertEquals("Just walk...", outContent.toString());
}

@Test
public void simpleDisplay() {
	subject = new Duck(new NoFly(), new SimpleQuack(), new SimpleDisplay());
	subject.display();
	
	Assert.assertEquals("A normal duck", outContent.toString());
}

@Test
public void superQuack() {
	subject = new Duck(new NoFly(), new SuperQuack(), new SimpleDisplay());
	subject.quack();
	
	Assert.assertEquals("QUUAAAAAACK!", outContent.toString());
}
```

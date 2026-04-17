@Test
void testPath1() {
    Calculator c = new Calculator();
    assertEquals(0, c.sumEvenNumbers(0));
}

@Test
void testPath2() {
    Calculator c = new Calculator();
    assertEquals(0, c.sumEvenNumbers(1));
}

@Test
void testPath3() {
    Calculator c = new Calculator();
    assertEquals(2, c.sumEvenNumbers(2));
}
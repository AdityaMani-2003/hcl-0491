import { greet, greetInHindi } from "../app.js";
import { describe, test } from "node:test";
import assert from "node:assert";

describe ("order feature", () => {
    test("that is process the order correctly", () => {
        const mockedProcessPayment = mock.fn((amount)=>{

        });

    });

});

describe("Greeting functions", () => {
  test("greet returns the correct greeting", () => {
    const expected = `Hello, World!`;
    const actual = greet("World");

    assert.strictEqual(actual, expected);
  });

  test("greet returns in hindi", () => {
    const expected = `Namaste, Duniya!`;
    const actual = greetInHindi("Duniya");
    assert.strictEqual(actual, expected);
  });
});
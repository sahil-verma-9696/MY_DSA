function generateCombinations(inp, temp, i, result, map) {
  if (i == inp.length) {
    result.push(temp);
    return;
  }
  let number = inp[i]; // 2
  let str = map[number]; // "abc"

  for (let it = 0; it < str.length; it++) {
    generateCombinations(inp, temp + str[it], i + 1, result, map);
  }
}

const result = [];
const map = {
  1: "",
  2: "abc",
  3: "def",
  4: "ghi",
  5: "jkl",
  6: "mno",
  7: "pqrs",
  8: "tuv",
  9: "wxyz",
};

generateCombinations("23", "", 0, result, map);

console.log(result);

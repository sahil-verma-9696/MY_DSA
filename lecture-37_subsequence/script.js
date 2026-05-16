// function subSequence(str, ans, result, i) {
//   if (i == str.length) {
//     result.push(ans);
//     return result;
//   }

//   result = subSequence(str, ans + str.charAt(i), result, i + 1);
//   result = subSequence(str, ans, result, i + 1);
// }

// console.log(subSequence("abc", "", [], 0));
// // function subSets(sequence, subsets, n, current = []) {
// //     if (n < 0) {
// //         subsets.push([...current]); // Store a copy of the current subset
// //         return;
// //     }

// //     // Exclude the current element
// //     subSets(sequence, subsets, n - 1, current);

// //     // Include the current element
// //     current.push(sequence[n]);
// //     subSets(sequence, subsets, n - 1, current);

// //     // Backtrack to restore the state
// //     current.pop();
// // }

// // let sequence = [];
// // let input = [1, 2, 3,4,5,6,7,8,9,10,11,12,13];
// // subSets(input, sequence, input.length - 1);

// // console.log(sequence);

// function abc() {
//   console.log(this.performance.__proto__.mark());
// }

// abc();



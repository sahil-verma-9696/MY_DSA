function isSorted(arr, n) {
  if (n == 0 || n == 1) return true;
  if (n != 1 && arr[n - 1] < arr[n - 2]) return false;

  let ans = isSorted(arr, n - 1);

  return ans;
}

console.log(isSorted([1, 2, 5, 4],4));

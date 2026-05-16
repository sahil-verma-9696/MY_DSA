class Heap {
  data = [];
  minHeap = true;

  constructor(arr = [], minHeap = true) {
    this.data = [...arr];
    this.minHeap = minHeap;
    this.buildHeap();
  }

  buildHeap() {
    for (let i = Math.floor(this.data.length / 2) - 1; i >= 0; i--) {
      this.heapifyDown(i);
    }
  }

  heapifyDown(index) {
    const parent = index;
    const left = index * 2 + 1;
    const right = index * 2 + 2;

    let min = parent;

    if (
      this.data[left] &&
      this.minHeap &&
      this.data[left] < this.data[parent]
    ) {
      min = left;
    }

    if (this.data[right] && this.minHeap && this.data[right] < this.data[min]) {
      min = right;
    }

    if (min != parent) {
      [this.data[parent], this.data[min]] = [this.data[min], this.data[parent]];
      this.heapifyDown(min);
    }
  }

  push(item) {
    this.data.push(item);
    this.buildHeap();
  }

  pop() {
    const item = this.data[0];

    this.data[0] = this.data[this.data.length - 1];
    this.data.pop();

    this.heapifyDown(0);

    return item;
  }
}

const myHeap = new Heap();

myHeap.push(-4);
myHeap.push(-14);
myHeap.push(-1);
myHeap.push(2);
myHeap.push(3);


myHeap.pop()
myHeap.pop()
myHeap.pop()

myHeap.push(-34)
myHeap.push(-23)

myHeap.pop()
console.log(myHeap);

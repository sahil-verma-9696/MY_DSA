class TreeNode {
  #data;
  #left;
  #right;

  constructor(data) {
    this.#data = data;
    this.#left = null;
    this.#right = null;
  }

  get left() {
    return this.#left;
  }

  set left(node) {
    this.#left = node;
  }

  get right() {
    return this.#right;
  }

  set right(node) {
    this.#right = node;
  }

  get data() {
    return this.#data;
  }

  toString() {
    return `${this.#data}`;
  }
}

class BinaryTree {
  #root;
  #current;

  constructor(root = null) {
    this.#root = root;
    this.#current = root;
  }

  insert(data) {
    let newNode = new TreeNode(data);

    if (!this.#current && !this.#root) {
      this.#root = newNode;
      this.#current = this.#root;
      return;
    }

    if (!this.#current.left) {
      this.#current.left = newNode;
      return;
    }

    if (!this.#current.right) {
      this.#current.right = newNode;
      this.#current = this.#current.left; // move pointer
      return;
    }
  }

  // 🌳 Show tree level by level
  show() {
    if (!this.#root) {
      console.log("Tree is empty");
      return;
    }

    let queue = [this.#root];
    while (queue.length > 0) {
      let levelSize = queue.length;
      let levelNodes = [];

      for (let i = 0; i < levelSize; i++) {
        let node = queue.shift();
        levelNodes.push(node ? node.data : "·"); // dot for missing nodes

        if (node) {
          queue.push(node.left);
          queue.push(node.right);
        }
      }

      console.log(levelNodes.join("   "));
    }
  }
}

const binaryTree = new BinaryTree();
binaryTree.insert(1);
binaryTree.insert(2);
binaryTree.insert(3);
binaryTree.insert(4);
binaryTree.insert(5);
binaryTree.insert(6);
binaryTree.insert(7);

binaryTree.show();

# 🎮 Connect Four Game (Java)

A simple **Connect Four** game developed in **Java**, where a human player competes against the computer. The project demonstrates the use of **2D arrays**, **game logic**, **loops**, **conditionals**, and **basic AI (random moves)**.

---

## 📌 Features

- 🎯 Player vs Computer gameplay
- 🎲 Computer makes random valid moves
- 🗂️ 6 × 7 game board
- 📥 Drop disc into a selected column
- ✅ Horizontal win detection
- ✅ Vertical win detection
- ❌ Invalid move handling
- 🖥️ Console-based interface

---

## 🛠️ Technologies Used

- Java
- IntelliJ IDEA (Recommended)
- Java Scanner
- Random Class

---

## 📂 Project Structure

```
ConnectFour/
│
├── ConnectFour.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/ConnectFour.git
```

2. Open the project in IntelliJ IDEA or any Java IDE.

3. Compile and run:

```bash
javac ConnectFour.java
java ConnectFour
```

---

## 🎮 How to Play

- The board consists of **6 rows** and **7 columns**.
- Empty cells are represented by `.`.
- You play as **X**.
- The computer plays as **O**.
- Enter a column number from **0 to 6**.
- The disc automatically drops to the lowest available position.
- The first player to connect **4 discs** horizontally or vertically wins.

Example:

```
. . . . . . .
. . . . . . .
. . . . . . .
. . . O . . .
. . X O . . .
X O X O X . .
```

---

## 🧠 Game Logic

### Player Move
- User enters a column number.
- The program validates the input.
- If the column is valid and not full, the player's disc (`X`) is placed.

### Computer Move
- The computer selects a random valid column.
- The disc (`O`) is dropped into that column.

### Win Detection
The game checks for:
- Horizontal connection of four discs
- Vertical connection of four discs

If a player connects four discs, the game ends and declares the winner.

---

## 📊 Time Complexity

| Operation | Complexity |
|-----------|------------|
| Drop Disc | O(Rows) |
| Horizontal Win Check | O(Rows × Columns) |
| Vertical Win Check | O(Rows × Columns) |

Overall per turn: **O(Rows × Columns)**

---

## 📈 Space Complexity

- Board Storage: **O(6 × 7)** = **O(1)**

---

## 🚀 Future Improvements

- ✅ Diagonal win detection
- 🎨 Java Swing GUI
- 🤖 Smart AI using Minimax Algorithm
- 🔊 Sound effects
- 💾 Save and Load Game
- ↩️ Undo move
- 🌙 Dark Mode
- 🏆 Scoreboard
- 👥 Player vs Player mode
- 🎬 Disc drop animations

---

## 📚 Concepts Used

- Java Programming
- 2D Arrays
- Loops
- Conditional Statements
- Methods
- Random Number Generation
- Input Validation
- Game Development Basics

---

## 👨‍💻 Author

**Kartik Kamatkar**

If you like this project, consider giving it a ⭐ on GitHub!

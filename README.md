# Conway's Game of Life
 
This repository contains an implementation of Conway's Game of Life, a cellular automaton experiment, as part of COSC 1P03 Assignment 1. The objective of this assignment is to practice handling 2D arrays.

Background
Conway's Game of Life is played on an mxn grid of cells, where each cell is either on or off. The state of the grid evolves based on four rules:

1. A dead cell (off/0) will activate if it has precisely three live neighbors.
2. A live cell with exactly two or three live neighbors will stay alive.
3. A live cell with only one or zero neighbors will die of loneliness.
4. A live cell with four or more neighbors will die of irritation.

In this implementation, an additional rule is assumed: a boundary cell has neighbors that wrap around.
  - A boundary cell (a cell at a corner or along one of the edges) has neighbors that wrap around. For example, in a 5x5 grid, cell[2][0]'s neighbors include cell[1][0], cell[1][1], cell[2][1], cell[3][1], and cell[3][0], as well as cell[1][4], cell[2][4], and cell[3][4].
  - 
## How to Run the Program
To run the program and simulate the Game of Life, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Download or clone this repository to your local machine.
3. Open a command prompt or terminal and navigate to the directory where the repository is located.
4. Compile the Java source files using the following command:
5. javac LifeGame.java
6. Run the program using the following command:
7. java LifeGame
8. When prompted, enter the name of the file containing the initial grid state.
9. Follow the on-screen instructions to specify the number of iterations to process.

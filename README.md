# Java Particle Interaction Simulator

This Java project is a 2D particle simulator that models the dynamic interactions between subatomic particles—specifically electrons, protons, and neutrons. The simulation is based on their fundamental physical properties: electrical charge and mass. It calculates the electrostatic forces between particles using Coulomb's Law and then updates their velocities and positions over discrete time steps.

The visualization of particle movement is achieved using the `StdDraw.java` library, a simple graphics library often used in introductory programming courses (this library file is included as part of this project). The project demonstrates object-oriented design principles with an abstract `Particle` class and concrete subclasses for each particle type.

## Features

* **Particle Representation:**
    * Abstract `Particle` class defines common properties (position, velocity) and methods (update, draw, getCharge, getMass, etc.).
    * Concrete subclasses: `Electron`, `Proton`, `Neutron`, each with specific charge, mass, radius, and color.
* **Physics Simulation:**
    * Calculates electrostatic forces between all pairs of particles based on Coulomb's Law (F = k * q1*q2 / r^2).
    * Updates particle acceleration, velocity, and position based on calculated net forces over small time intervals.
* **Visualization:**
    * Uses `StdDraw.java` to render particles as colored circles on a 2D canvas.
    * The simulation runs in a loop, clearing and redrawing the particles in their new positions each frame to create an animation.
* **Initialization:** Randomly places a specified number of electrons, protons, and neutrons within the simulation space.
* **Double Buffering:** Enabled via `StdDraw` for smoother animation.

## Technologies Used

* **Java:** Core programming language.
* **Object-Oriented Programming (OOP):** Inheritance (Particle subclasses), Abstraction (Particle class), Encapsulation.
* **Physics Concepts:** Coulomb's Law, Newtonian mechanics (F=ma, kinematics).
* **`StdDraw.java`:** A provided simple graphics library for 2D drawing and animation (included in the project).
* **Basic Animation Loop:** For continuous updates and rendering.

## How to Compile and Run

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed (e.g., JDK 8 or later).

2.  **Download Files:**
    * Ensure you have all necessary `.java` files in a single directory (or within a `particles` package if you structured it that way):
        * `Particle.java` (Abstract base class)
        * `Electron.java`
        * `Proton.java`
        * `Neutron.java`
        * `Simulator.java` (Main class with the simulation loop)
        * `StdDraw.java` (Graphics library - **MUST be in the same directory or accessible in the classpath**)

3.  **Compile:**
    * Open a terminal or command prompt.
    * Navigate to the directory where you saved the `.java` files.
    * Compile all the Java files:
        ```bash
        javac *.java
        ```
        (If your files are in a package, e.g., `particles`, you'd compile from the directory *above* `particles` using `javac particles/*.java`)

4.  **Run:**
    * After successful compilation, run the main class (`Simulator.java`):
        ```bash
        java particles.Simulator
        ```
        (If you compiled them within a `particles` package as suggested by the `package particles;` statement in your files. If they are in the default package, just use `java Simulator`.)
    * A window should appear showing the particles interacting. The simulation runs indefinitely until the window is closed.

## Project Structure

(Assuming files are in a `particles` package as indicated in the source code)
* **`particles` package:**
    * `Particle.java`: Abstract base class for all particles.
    * `Electron.java`: Represents an electron.
    * `Proton.java`: Represents a proton.
    * `Neutron.java`: Represents a neutron.
    * `Simulator.java`: The main application class that sets up and runs the simulation loop.
    * `StdDraw.java`: The graphics library used for visualization.

---

*Developed by Adam Garantche.*

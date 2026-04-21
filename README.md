# LiveBank 🚀

**LiveBank** is a high-performance banking processing system, now completely rewritten to raise the bar for security and scalability.

### 🔄 The Transition: From Java to Rust
The LiveBank project has undergone a significant evolution. We have decided to migrate our entire codebase from **Java** to **Rust**. This shift was not merely technical but strategic, aimed at delivering the cutting edge of financial software engineering.

### 🛡️ Why Rust?
The migration to Rust brings three fundamental pillars to LiveBank:

1.  **Memory Safety:** Unlike Java, Rust eliminates vulnerabilities such as null pointer exceptions and data races at compile time, ensuring the financial core is shielded against critical failures.
2.  **Power and Performance:** Without the overhead of a Garbage Collector (GC), LiveBank now operates with minimal latency and maximum hardware efficiency, enabling the processing of thousands of transactions per second with low resource consumption.
3.  **Reliability (Ownership & Borrowing):** Rust's strict type system allows us to build complex business logic with the certainty that the application state is predictable and secure.

---

## 🛠️ Technologies

- **Language:** Rust (Latest Stable)
- **Framework:** Axum / Tokio (Async Runtime)
- **Database:** PostgreSQL / Diesel
- **Containerization:** Docker & Kubernetes

## 🚀 How to Run

```bash
# Clone the repository
git clone [https://github.com/MateusSoaresL/LiveBank.git](https://github.com/MateusSoaresL/LiveBank.git)

# Enter the folder
cd LiveBank

# Build and run
cargo run --release
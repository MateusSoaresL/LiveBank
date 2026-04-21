use std::io::{self, Write};

pub struct Account {
    balance: f32,
    value: f32,
}

impl Account {
    pub fn new(balance: f32, value: f32) -> Self {
        Self { balance, value }
    }

    pub fn balance(&self) -> f32 {
        self.balance
    }

    pub fn add_money(&mut self) {
        print!("Add: ");

        io::stdout().flush().expect("Error when use the flush!");

        let mut input: String = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Error when read the value!");

        let value: f32 = input.trim().parse().expect("Type a valid number!");

        self.value = value;
        self.balance += value;
    }

    pub fn to_transfer(&mut self) {
        print!("To transfer: ");

        io::stdout().flush().expect("Error when use the flush!");

        let mut input: String = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Error when read the value!");

        let value: f32 = input.trim().parse().expect("Type a valid number!");

        self.value = value;
        self.balance -= value;
    }
}

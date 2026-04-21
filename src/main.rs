mod account;

use std::io::{self, Write};
use colored::Colorize;

use crate::account::Account;

fn main() {
    let mut account = Account::new(0.0, 0.0);
    let mut input: String = String::new();

    loop {
        let balance = account.balance();

        println!("=== LiveBank ===");
        println!("1. Add money");
        println!("2. To transfer");
        println!("3. Exit");
        if balance < 0.0 {
            println!("Balance: {}", format!("{:.2}", balance).red());
        } else {
            println!("Balance: {}", format!("{:.2}", balance).green());
        }
        print!("> ");

        io::stdout().flush().expect("Error when use flush!");

        input.clear();

        io::stdin()
            .read_line(&mut input)
            .expect("Error when read the input!");

        match input.trim() {
            "1" => account.add_money(),
            "2" => account.to_transfer(),
            "3" => break,
            _ => println!("Invalid option!"),
        }
    }
}

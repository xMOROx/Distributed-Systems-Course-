use std::future::Future;
use std::process::Output;
use crate::command_handler::CommandsHandler;
use crate::command_parser;

pub struct LocalCommandsHandler;

impl LocalCommandsHandler {
    pub(crate) async fn handle_command(&self, command: &command_parser::Command) -> Result<bool, String> {
        if command.get_command() != "!" {
            return Ok(false);
        }

        let action = command.get_action().clone().expect("Action is required");

        match action.to_lowercase().as_str() {
            "quit" => {
                println!("Quiting");
                Ok(true)
            }
            _ => Ok(false)
        }
    }
}
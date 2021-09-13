package duke.command;

import duke.Storage;
import duke.task.TaskList;

/** Represents a command that can be executed. */
public abstract class Command {

    /**
     * Executes the command a returns the resulting message
     *
     * @param tasks The user's task list.
     * @param storage Storage object used to save the task list to the data file.
     * @return A message resulting from the execution of the command.
     */
    public abstract String execute(TaskList tasks, Storage storage);
}

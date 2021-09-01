package duke;

import duke.task.Task;

/**
 * Ui class that handles UI and Outputs to the user.
 */
public class Ui {

    /**
     * Prints a horizontal line that separates user inputs from Duke's outputs.
     */
    public static void printLine() {
        System.out.println("____________________________________________");
    }

    /**
     * Prints a given message enclosed with horizontal lines.
     *
     * @param message The given message.
     */
    public void printMessage(String message) {
        printLine();
        System.out.println(message);
        printLine();
    }

    /**
     * Prints the welcome message when Duke is ran.
     */
    public void printWelcomeMessage() {
        printLine();
        System.out.println("Hello I'm duke\nWhat can I do for you?");
        printLine();
    }

    /**
     * Prints the goodbye message when the user exits the program.
     */
    public void printGoodbyeMessage() {
        printLine();
        System.out.println("Bye. Hope to see you again soon!");
        printLine();
    }

    /**
     * Prints a message that informs the user which task has been marked as done.
     *
     * @param task The task that the user has marked as done.
     */
    public static String getDoneMessage(Task task) {
        return "Nice! I've marked this done:\n  " + task;
    }

    /**
     * Prints a message that informs the user which task has been deleted.
     *
     * @param task The task that the user deletes from the task list.
     * @param taskCount The number of tasks left in the task list.
     */
    public static String getDeleteMessage(Task task, int taskCount) {
        return "Noted. I've removed this task:\n  " + task
                + "\n" + getTaskCountMessage(taskCount);
    }

    /**
     * Prints a message that informs the user which task has been added.
     *
     * @param task The task that the user adds to the task list.
     * @param taskCount The number of tasks in the list after adding.
     */
    public static String getAddedMessage(Task task, int taskCount) {
        return "Got it. I've added this task:\n  " + task
                + "\n" + getTaskCountMessage(taskCount);
    }

    /**
     * Prints a message that informs user how many tasks they have in the task list
     *
     * @param taskCount The number of tasks in the task list.
     */
    private static String getTaskCountMessage(int taskCount) {
        return "Now you have " + taskCount + " tasks in the list.";
    }

}

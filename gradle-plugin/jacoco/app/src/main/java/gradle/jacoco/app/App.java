/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.jacoco.app;

import gradle.jacoco.list.LinkedList;

import static gradle.jacoco.utilities.StringUtils.join;
import static gradle.jacoco.utilities.StringUtils.split;
import static gradle.jacoco.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}

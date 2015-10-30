import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.ALL

scan()

appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{dd-MM-yyyy HH:mm:ss.SSS} %p [%t] %c{1}: %m%n"
  }
}

root(ALL, ["CONSOLE"])
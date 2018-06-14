package org.ankburov.logtailer;

import java.util.List;

/**
 * LogTailerListener interface. Implement this interface to create listener object
 */
public interface LogTailerListener {
    /**
     * This method is called if the tailed file is not found.
     */
    void fileNotFound();

    /**
     * Method handles with response from tailer
     */
    void update(List<String> lines);

    /**
     * Method handles any exception, except IOException (file not found)
     */
    void handleException(Exception exception);

    /**
     * Method is called if tailed file was deleted and tailer is termination
     */
    void handleRemovedFile();
}

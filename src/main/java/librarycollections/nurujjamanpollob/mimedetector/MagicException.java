/*
jMimeMagic (TM) is a Java Library for determining the content type of files or streams
Copyright (C) 2003-2017 David Castro
*/
package librarycollections.nurujjamanpollob.mimedetector;

/**
 * Basic JMimeMagic parse exception. This is simply a holder to identify a parsing problem. It
 * should be extended to identify more specific issues.
 *
 * @author $Author: arimus $
 * @version $Revision: 1.1 $
 */
@SuppressWarnings({"unused"})
public class MagicException extends Exception
{
/**
         * Default constructor
         */
    public MagicException()
    {
        super();
    }

/**
         * Create exception with error message
         * 
         * @param message The error message for this exception
         */
    public MagicException(String message)
    {
        super(message);
    }

/**
         * Create exception based on an existing Throwable
         * 
         * @param cause The throwable on which we'll base this exception
         */
    public MagicException(Throwable cause)
    {
        super(cause);
    }

/**
         * Create an exception with custom message and throwable info
         * 
         * @param message The message
         * @param cause The target Throwable
         */
    public MagicException(String message, Throwable cause)
    {
        super(message, cause);
    }
}

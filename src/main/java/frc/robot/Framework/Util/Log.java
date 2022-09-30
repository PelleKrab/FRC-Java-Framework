package frc.robot.Framework.Util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import edu.wpi.first.wpilibj.Filesystem;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Log {
    private String subsystem;
    private long startTime;
    private FileWriter outputfile;
    private String[] headers;

    public Log(String subsystem, String[] headers) {
        this.subsystem = subsystem;
        this.headers = headers;
        setupLog();
    }

    public void RestartNewLog() {
        setupLog();
    }

    private void setupLog() {
        if (outputfile != null) {
            try {
                outputfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.print("Log Test");
        startTime = Instant.now().toEpochMilli();
        File file = new File(Filesystem.getOperatingDirectory() + "/Logs/"
                + java.time.LocalDateTime.now().format(DateTimeFormatter.ISO_DATE) + "-" + subsystem + ".csv");

        try {
            outputfile = new FileWriter(file);

            outputfile.write(String.join(",", headers));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void Write(String mode, String data) {
        try {
            outputfile.write((Instant.now().toEpochMilli() - startTime) / 1000 + "," + mode + "," + data + "\r\n");
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void WriteHeaders() {
        try {
            outputfile.write(String.join(",", headers));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    protected void finalize() throws IOException {
        outputfile.close();
    }
    // File name locate in ./log/date-subsytsem
    // Delete logs more than 20
    // Functions for init create file
    // Flush everything in the file
    // When logging is disposed close file
    // creat methods for logging of a sring
    // Pass to subsystem every subsystem will get own logging
    // Support headers csv format
    // Method for
    // Time, mode, values
    // Everytime substem run call logging
}

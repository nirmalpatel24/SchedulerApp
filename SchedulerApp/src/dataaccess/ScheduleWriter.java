/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

/**
 *
 * @author Nirmal
 */
public interface ScheduleWriter {
    void setdate(String event_date);
    void settime(String event_time);
    void setdiscription(String discription);
    
}

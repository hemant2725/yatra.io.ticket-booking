package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Builder
// Adding these annotations helps avoid constructor boilerplate
@NoArgsConstructor
@AllArgsConstructor
public class Train {

    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String, String> stationTimes;


    @JsonIgnore
    public List<String> getStations(){
        if (stationTimes == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(stationTimes.keySet());
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats){
        this.seats = seats;
    }

    public String getTrainId(){
        return trainId;
    }

    public Map<String, String> getStationTimes(){
        return stationTimes;
    }

    public String getTrainNo(){
        return trainNo;
    }

    public void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }

    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    public void setStationTimes(Map<String, String> stationTimes){
        this.stationTimes = stationTimes;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", trainId, trainNo);
    }
}
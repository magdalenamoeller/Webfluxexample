package awin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ClusterHealth {
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getTimedOut() {
        return timedOut;
    }

    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
    }

    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    public Integer getNumberOfDataNodes() {
        return numberOfDataNodes;
    }

    public void setNumberOfDataNodes(Integer numberOfDataNodes) {
        this.numberOfDataNodes = numberOfDataNodes;
    }

    public Integer getActivePrimaryShards() {
        return activePrimaryShards;
    }

    public void setActivePrimaryShards(Integer activePrimaryShards) {
        this.activePrimaryShards = activePrimaryShards;
    }

    public Integer getActiveShards() {
        return activeShards;
    }

    public void setActiveShards(Integer activeShards) {
        this.activeShards = activeShards;
    }

    public Integer getRelocatingShards() {
        return relocatingShards;
    }

    public void setRelocatingShards(Integer relocatingShards) {
        this.relocatingShards = relocatingShards;
    }

    public Integer getInitializingShards() {
        return initializingShards;
    }

    public void setInitializingShards(Integer initializingShards) {
        this.initializingShards = initializingShards;
    }

    public Integer getUnassignedShards() {
        return unassignedShards;
    }

    public void setUnassignedShards(Integer unassignedShards) {
        this.unassignedShards = unassignedShards;
    }

    public Integer getDelayedUnassignedShards() {
        return delayedUnassignedShards;
    }

    public void setDelayedUnassignedShards(Integer delayedUnassignedShards) {
        this.delayedUnassignedShards = delayedUnassignedShards;
    }

    public Integer getNumberOfPendingTasks() {
        return numberOfPendingTasks;
    }

    public void setNumberOfPendingTasks(Integer numberOfPendingTasks) {
        this.numberOfPendingTasks = numberOfPendingTasks;
    }

    public Integer getNumberOfInFlightFetch() {
        return numberOfInFlightFetch;
    }

    public void setNumberOfInFlightFetch(Integer numberOfInFlightFetch) {
        this.numberOfInFlightFetch = numberOfInFlightFetch;
    }

    public Integer getTaskMaxWaitingInQueueMillis() {
        return taskMaxWaitingInQueueMillis;
    }

    public void setTaskMaxWaitingInQueueMillis(Integer taskMaxWaitingInQueueMillis) {
        this.taskMaxWaitingInQueueMillis = taskMaxWaitingInQueueMillis;
    }

    public Double getActiveShardsPercentAsNumber() {
        return activeShardsPercentAsNumber;
    }

    public void setActiveShardsPercentAsNumber(Double activeShardsPercentAsNumber) {
        this.activeShardsPercentAsNumber = activeShardsPercentAsNumber;
    }

    @JsonProperty("cluster_name")
    public String clusterName;
    @JsonProperty("status")
    public String status;
    @JsonProperty("timed_out")
    public Boolean timedOut;
    @JsonProperty("number_of_nodes")
    public Integer numberOfNodes;
    @JsonProperty("number_of_data_nodes")
    public Integer numberOfDataNodes;
    @JsonProperty("active_primary_shards")
    public Integer activePrimaryShards;
    @JsonProperty("active_shards")
    public Integer activeShards;
    @JsonProperty("relocating_shards")
    public Integer relocatingShards;
    @JsonProperty("initializing_shards")
    public Integer initializingShards;
    @JsonProperty("unassigned_shards")
    public Integer unassignedShards;
    @JsonProperty("delayed_unassigned_shards")
    public Integer delayedUnassignedShards;
    @JsonProperty("number_of_pending_tasks")
    public Integer numberOfPendingTasks;
    @JsonProperty("number_of_in_flight_fetch")
    public Integer numberOfInFlightFetch;
    @JsonProperty("task_max_waiting_in_queue_millis")
    public Integer taskMaxWaitingInQueueMillis;
    @JsonProperty("active_shards_percent_as_number")
    public Double activeShardsPercentAsNumber;
}

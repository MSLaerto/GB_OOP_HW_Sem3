package sem3;

import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller() {
        streamService = new StreamService();
    }
    
    // Остальные методы класса Controller
    
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}
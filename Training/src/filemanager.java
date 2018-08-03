import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;

public class filemanager {

	class Task1 implements Runnable{

		String fileName;
		public Task1(String fileName) {
			this.fileName = fileName;
		}

		@Override
		public void run() {
			
			List<String> lines=new ArrayList<String>(); 
			try {
				lines.addAll(Files.readAllLines(Paths.get("C:/Users/singhals/Desktop/Source/"+fileName)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lines.replaceAll(String::toUpperCase);
			try {
				Files.write(Paths.get("C:/Users/singhals/Desktop/Destination/"+fileName), lines, StandardOpenOption.CREATE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(fileName+" copied by thread "+Thread.currentThread().getId());
			 File file = new File("C:/Users/singhals/Desktop/Source/"+fileName);
		        if(file.delete()){
		            System.out.println("/Users/pankaj/file.txt File deleted");
		        }else System.out.println("File /Users/pankaj/file.txt doesn't exists");
		}
	}

	void launch() throws IOException, InterruptedException
	{
		Path faxFolder = Paths.get("C:/Users/singhals/Desktop/Source");
		WatchService watchService = FileSystems.getDefault().newWatchService();
		faxFolder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
		boolean valid = true;
		do {
			WatchKey watchKey = watchService.take();
			for (WatchEvent event : watchKey.pollEvents()) 
			{
				WatchEvent.Kind kind = event.kind();
				if (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind()))
				{
					String fileName = event.context().toString();
					System.out.println("File Created:" + fileName);
					new Thread(new Task1(fileName)).start();

				}
			}
			valid = watchKey.reset();
		} while (valid);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		new filemanager().launch();
	}


}

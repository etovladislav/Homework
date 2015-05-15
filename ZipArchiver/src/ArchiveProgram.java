import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ArchiveProgram {
	
	public void unarchive(String name) {
		try (ZipInputStream zis = new ZipInputStream(new FileInputStream(name))) {
			ZipEntry entry;
			while ((entry = zis.getNextEntry()) != null) {
				try (FileOutputStream fos = new FileOutputStream(
						entry.getName())) {
					int smth = 0;

					while ((smth = zis.read()) != -1) {
						fos.write(smth);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void archive(String zipName, String[] files) {
		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(
				zipName))) {
			for (int i = 0; i < files.length; i++) {
				if (!new File(files[i]).isFile()) {
					System.out.println(files[i] + " not found");
					continue;
				}

				try (FileInputStream fis = new FileInputStream(files[i])) {
					zos.putNextEntry(new ZipEntry(files[i]));
					int smth;
					while ((smth = fis.read()) != -1) {
						zos.write(smth);
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
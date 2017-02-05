package ashen.ashen27;

import java.nio.ByteBuffer;
import java.util.UUID;

public class GUUID {

	public static String shortUUID() {
		  UUID uuid = UUID.randomUUID();
		  long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
		  return Long.toString(l, Character.MAX_RADIX);
		}
}

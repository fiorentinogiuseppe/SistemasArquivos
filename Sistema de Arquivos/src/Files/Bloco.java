package Files;

public class Bloco {

	private File arq;
	private Diretorio dir;
	private static final int TAMANHO = 1;
	
	public Bloco(File arq) {
		this.arq = arq;
		this.dir = null;
	}
	
	public Bloco(Diretorio dir) {
		this.arq = null;
		this.dir = dir;
	}

	public File getArq() {
		return arq;
	}

	public void setArq(File arq) {
		this.arq = arq;
	}

	public Diretorio getDir() {
		return dir;
	}

	public void setDir(Diretorio dir) {
		this.dir = dir;
	}

	public static int getTamanho() {
		return TAMANHO;
	}

	@Override
	public String toString() {
		return "Bloco [" + (arq != null ? "Arquivo = " + arq.getNomeExtensao() + ", Caminho = "
				+ "" + arq.getCaminho() : "") + (dir != null ? "Diretório = "
						+ "" + dir.getNome() + ", Caminho = " + dir.getCaminho() : "") + "]\n";
	}
	
	public static String blocoNull() {
		return "Bloco []\n";
	}
	
}

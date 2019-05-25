Toolkit toolkit = Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				String result = (String) clipboard.getData(DataFlavor.stringFlavor);
				System.out.println("String from Clipboard:" + result);

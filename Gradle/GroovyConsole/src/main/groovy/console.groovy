def credentials = [:]
credentials.put("Beatrice", "cisco123")
credentials.put("Francis", "11111111")
credentials.put("Dollie", "pa55w0rd")
credentials.put("Marian", "asdfgh")
credentials.put("Lina", "11111")
credentials.put("Josephine", "123abc")
credentials.put("Matthew", "asdf")
credentials.put("Louisa", "centos")
credentials.put("Herman", "888888")
credentials.put("Claudia", "54321")

credentials.forEach((name,password) -> {
    System.out.println(name + " -> "+ (name+":"+password).bytes.encodeBase64())
})
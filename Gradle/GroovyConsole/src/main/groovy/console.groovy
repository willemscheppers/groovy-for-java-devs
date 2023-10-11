def credentials = [:]
credentials << ["Beatrice": "cisco123"]
credentials << ["Francis": "11111111"]
credentials << ["Dollie": "pa55w0rd"]
credentials << ["Marian": "asdfgh"]
credentials << ["Lina": "11111"]
credentials << ["Josephine": "123abc"]
credentials << ["Matthew": "asdf"]
credentials << ["Louisa": "centos"]
credentials << ["Herman": "888888"]
credentials << ["Claudia": "54321"]

credentials.forEach((name, password) -> {
    System.out.println(name + " -> " + (name + ":" + password).bytes.encodeBase64())
})
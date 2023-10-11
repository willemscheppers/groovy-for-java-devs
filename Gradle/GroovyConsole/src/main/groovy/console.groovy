def credentials = [
        Beatrice : "cisco123",
        Francis  : "11111111",
        Dollie   : "pa55w0rd",
        Marian   : "asdfgh",
        Lina     : "11111",
        Josephine: "123abc",
        Matthew  : "asdf",
        Louisa   : "centos",
        Herman   : "888888",
        Claudia  : "54321"
]

credentials.each { name, password ->
    println name + " -> " + (name + ":" + password).bytes.encodeBase64()
}
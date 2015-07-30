class BootStrap {

    def init = { servletContext ->
        def b = new demo.Book(title: '')
        assert b.title != null
    }
    def destroy = {
    }
}

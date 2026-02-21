case class myUser(
        name: String,
        email: String,
        groups: Set[myGroup]
      )

object myUser {
              def addGroup(user: myUser , group: myGroup): myUser =
                      user.copy(groups = user.groups + group)
}


